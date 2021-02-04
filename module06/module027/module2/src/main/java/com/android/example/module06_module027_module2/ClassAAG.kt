package com.android.example.module06_module027_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module027_module3.ClassAAB = com.android.example.module06_module027_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module027_module1.ClassAAB = com.android.example.module06_module027_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module027_module3.ClassAAA = com.android.example.module06_module027_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module027_module1.ClassAAB,
		param1: com.android.example.module06_module027_module1.ClassAAB,
		param2: com.android.example.module06_module027_module3.ClassAAE,
		param3: com.android.example.module06_module027_module1.ClassAAE
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.dispose()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.hasSubscription()

		}
		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.request(-7130084977005181406)

	}

	fun method1(
		param0: com.android.example.module06_module027_module1.ClassAAG,
		param1: com.android.example.module06_module027_module1.ClassAAD
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

	}

	fun method2(
		param0: com.android.example.module06_module027_module1.ClassAAC,
		param1: com.android.example.module06_module027_module3.ClassAAG,
		param2: com.android.example.module06_module027_module3.ClassAAD,
		param3: com.android.example.module06_module027_module3.ClassAAI
	) {
		param0.method0(com.android.example.module06_module027_module3.ClassAAG(), com.android.example.module06_module027_module3.ClassAAC())

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

	}

	fun method3(
		param0: com.android.example.module06_module027_module3.ClassAAI,
		param1: com.android.example.module06_module027_module1.ClassAAG,
		param2: com.android.example.module06_module027_module3.ClassAAH,
		param3: com.android.example.module06_module027_module3.ClassAAF
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.dispose()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onNext(kotlin.Any())

	}

	fun method4(
		param0: com.android.example.module06_module027_module1.ClassAAA,
		param1: com.android.example.module06_module027_module3.ClassAAG,
		param2: com.android.example.module06_module027_module3.ClassAAE,
		param3: com.android.example.module06_module027_module1.ClassAAC
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

		param0.method2(com.android.example.module06_module027_module3.ClassAAA())

	}
}
