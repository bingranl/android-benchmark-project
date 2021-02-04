package com.android.example.module06_module076_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module076_module5.ClassAAF = com.android.example.module06_module076_module5.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module076_module1.ClassAAG = com.android.example.module06_module076_module1.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module076_module5.ClassAAH = com.android.example.module06_module076_module5.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module06_module076_module5.ClassAAG = com.android.example.module06_module076_module5.ClassAAG()
	private 	val instance_var_1_4: com.android.example.module06_module076_module1.ClassAAD = com.android.example.module06_module076_module1.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module076_module5.ClassAAA
	) {
		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module076_module1.ClassAAG,
		param1: com.android.example.module06_module076_module1.ClassAAH,
		param2: com.android.example.module06_module076_module5.ClassAAJ,
		param3: com.android.example.module06_module076_module1.ClassAAI
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
			local_var_3_0.createWorker()

		}
	}

	fun method2(
		param0: com.android.example.module06_module076_module5.ClassAAF,
		param1: com.android.example.module06_module076_module1.ClassAAA,
		param2: com.android.example.module06_module076_module5.ClassAAG
	) {
	}

	fun method3(
		param0: com.android.example.module06_module076_module5.ClassAAH,
		param1: com.android.example.module06_module076_module1.ClassAAE,
		param2: com.android.example.module06_module076_module5.ClassAAG,
		param3: com.android.example.module06_module076_module5.ClassAAD
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.dispose()

		param0.method1("SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString", "SomeString")

	}

	fun method4(
		param0: com.android.example.module06_module076_module1.ClassAAB
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

	}
}
