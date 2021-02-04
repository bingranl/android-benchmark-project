package com.android.example.module07_module39_module2_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..4) {
			listOf("1", "2", "3").forEach {
				for (iAc in 0..6) {
					val local_var_5_0: com.android.example.module06_module173_module1.ClassAAA = com.android.example.module06_module173_module1.ClassAAA()
					local_var_5_0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

					val local_var_5_1: com.android.example.module06_module173_module1.ClassAAI = com.android.example.module06_module173_module1.ClassAAI()
					local_var_5_1.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

					local_var_5_0.method2(io.reactivex.observers.TestObserver(), io.reactivex.internal.disposables.ListCompositeDisposable())

					val local_var_5_2: com.android.example.module15_module21_module1.ClassAAE = com.android.example.module15_module21_module1.ClassAAE()
					local_var_5_2.method2("SomeString", "SomeString", "SomeString")

				}
			}
			param0.isCancelled()

		}
		param0.isDisposed()

		val local_var_2_3: com.android.example.module15_module39_module1.ClassAAG = com.android.example.module15_module39_module1.ClassAAG()
		local_var_2_3.method0(com.android.example.module15_module21_module1.ClassAAF(), com.android.example.module15_module21_module1.ClassAAC(), com.android.example.module15_module21_module1.ClassAAJ())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
	}
}
