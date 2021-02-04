package com.android.example.module07_module39_module2_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_3: com.android.example.module06_module173_module1.ClassAAE = com.android.example.module06_module173_module1.ClassAAE()
		local_var_2_3.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		for (iAb in 0..3) {
			val local_var_3_0: com.android.example.module15_module21_module1.ClassAAI = com.android.example.module15_module21_module1.ClassAAI()
			local_var_3_0.method2("SomeString", "SomeString")

			val local_var_3_1: com.android.example.module15_module39_module1.ClassAAB = com.android.example.module15_module39_module1.ClassAAB()
			local_var_3_1.method0(com.android.example.module15_module21_module1.ClassAAJ(), com.android.example.module15_module21_module1.ClassAAD(), com.android.example.module15_module21_module1.ClassAAE())

		}
		val local_var_2_4: com.android.example.module15_module39_module1.ClassAAI = com.android.example.module15_module39_module1.ClassAAI()
		local_var_2_4.method1(com.android.example.module15_module21_module1.ClassAAJ(), com.android.example.module15_module21_module1.ClassAAB(), com.android.example.module15_module21_module1.ClassAAI())

		val local_var_2_5: com.android.example.module15_module21_module1.ClassAAG = com.android.example.module15_module21_module1.ClassAAG()
		local_var_2_5.method0("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		param0.isDisposed()

		param0.onError(kotlin.Throwable())

	}
}
