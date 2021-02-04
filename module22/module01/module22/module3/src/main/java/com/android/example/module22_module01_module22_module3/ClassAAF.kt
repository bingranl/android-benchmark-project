package com.android.example.module22_module01_module22_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module257_module3.ClassAAJ = com.android.example.module06_module257_module3.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module06_module257_module3.ClassAAE = com.android.example.module06_module257_module3.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module06_module257_module3.ClassAAC = com.android.example.module06_module257_module3.ClassAAC()
	private 	val instance_var_1_3: com.android.example.module06_module257_module3.ClassAAC = com.android.example.module06_module257_module3.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module06_module257_module3.ClassAAB = com.android.example.module06_module257_module3.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module257_module3.ClassAAG,
		param1: com.android.example.module06_module257_module3.ClassAAE,
		param2: com.android.example.module06_module257_module3.ClassAAA,
		param3: com.android.example.module06_module257_module3.ClassAAE
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-7947587110462179444)

		for (iAb in 0..3) {
			for (iAc in 0..6) {
				param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.request(7686497644985707755)

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onError(kotlin.Throwable())

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.requestMore(910303812021227541)

		}
	}

	fun method1(
		param0: com.android.example.module06_module257_module3.ClassAAD
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

	}

	fun method2(
		param0: com.android.example.module06_module257_module3.ClassAAF
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.isDisposed()

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.isDisposed()

	}

	fun method3(
		param0: com.android.example.module06_module257_module3.ClassAAJ,
		param1: com.android.example.module06_module257_module3.ClassAAG,
		param2: com.android.example.module06_module257_module3.ClassAAC,
		param3: com.android.example.module06_module257_module3.ClassAAC
	) {
	}

	fun method4(
		param0: com.android.example.module06_module257_module3.ClassAAE,
		param1: com.android.example.module06_module257_module3.ClassAAF
	) {
		param0.method2(io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

	}
}
